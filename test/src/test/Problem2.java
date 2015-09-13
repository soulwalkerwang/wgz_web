package test;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class Problem2 
{ 
    private final static String OP1 = "+";  
           
    private final static String OP2 = "-";  
         
    private final static String OP3 = "*";  
          
    private final static String OP4 = "/";  
       
    private final static String OPSTART = "(";  
         
    private final static String OPEND = ")";  
      
   
    //private final static String LOWESTSING = "#";  
    //The original arithmetic    
    private String expBase;  
      
    //After dealing with the initialization of arithmetic
    private String expInited;  
    
    
    
    private int precision=10;  
         
    //Choose model 
    private RoundingMode roundingMode=RoundingMode.HALF_UP;  
      
    //Precision context
    private MathContext mc;  
         
    //Arithmetic parsing  
    private List<String> expList = new ArrayList<String>();  
     
  
    private List<String> rpnList = new ArrayList<String>();  
      
    public Problem2(){  
    }  
      
    public Problem2(String expBase) {  
        init(expBase,this.precision,this.roundingMode);  
    }  
  
    public Problem2(String expBase,int precision,RoundingMode roundingMode){  
        init(expBase,precision,roundingMode);  
    }  
      
    public void init(String expBase,int precision,RoundingMode roundingMode){  
        this.expBase = expBase;  
        this.precision = precision;  
        this.roundingMode = roundingMode;  
        this.mc = new MathContext(precision,roundingMode);  
        this.expInited = initExpress(expBase);  
          
        StringTokenizer st = new StringTokenizer(this.expInited,"+-*/^%()",true);  
        while(st.hasMoreElements()){  
            this.expList.add(st.nextElement().toString().trim());  
        }  
          
        this.rpnList = initRPN(this.expList);  
          
  
    }  
       
    public String getExpBase() {  
        return expBase;  
    }  
   
    public void setExpBase(String expBase) {  
        this.expBase = expBase;  
    }  
   
    public String getExpInited() {  
        return expInited;  
    }  
   
    public void setExpInited(String expInited) {  
        this.expInited = expInited;  
    }  
  
    public int getPrecision() {  
        return precision;  
    }  
   
    public void setPrecision(int precision) {  
        this.precision = precision;  
    }  
  
    public RoundingMode getRoundingMode() {  
        return roundingMode;  
    }  
   
    public void setRoundingMode(RoundingMode roundingMode) {  
        this.roundingMode = roundingMode;  
    }  
   
    public List<String> getExpList() {  
        return expList;  
    }  
   
    public void setExpList(List<String> expList) {  
        this.expList = expList;  
    }  
    
    public List<String> getRpnList() {  
        return rpnList;  
    }  
  
    public void setRpnList(List<String> rpnList) {  
        this.rpnList = rpnList;  
    }  
   
    public MathContext getMc() {  
        return mc;  
    }  
  
    public void setMc(MathContext mc) {  
        this.mc = mc;  
    }  
  
    private static String initExpress(String exp){  
        String reStr = null;  
        reStr = exp.replaceAll("\\s", "");  
        if(reStr.startsWith("-")){  
            reStr = "0"+reStr;  
        }  
        reStr = reStr.replaceAll("\\(\\-", "(0-");  
        return reStr;  
    }  
      
   
    private boolean isNumber(String str){  
        Pattern p = Pattern.compile("^(-?\\d+)(\\.\\d+)?$");  
        Matcher m = p.matcher(str);  
        boolean isNumber = m.matches();  
        return isNumber;  
    }  
      
   
    private int precedence(String str){  
        char sign = str.charAt(0);  
        switch(sign){  
            case '+':  
            case '-':  
                return 1;  
            case '*':  
            case '/':  
                return 2;  
            case '^':  
            case '%':  
                return 3;  
            case '(':  
            case ')':  
//          case '#':  
            default:  
                return 0;  
              
        }  
    }  
      
  
    public List<String> initRPN(List<String> strList){  
        List<String> returnList = new ArrayList<String>();  
        //The stack used to store operator
        Stack stack = new Stack();  
        //stack.push(LOWESTSING);  
        int length = strList.size();  
        for(int i=0;i<length;i++ ){  
            String str = strList.get(i);  
            if(isNumber(str)){  
                returnList.add(str);  
            }else{  
                if(str.equals(OPSTART)){  
                    //'('Directly into the stack
                    stack.push(str);  
                }else if(str.equals(OPEND)){  
                    //')'  
                    //popping operation£¬until the stack empty or meet first "("
                    while (!stack.isEmpty()) {     
                        //The top string to stack operation     
                        String tempC = stack.pop();     
                        if (!tempC.equals(OPSTART)) {     
                            //if it is not "(" put the string following the Reverse polish list    
                            returnList.add(tempC);     
                        }else{     
                            //if it is "(" break   
                            break;     
                        }     
                    }     
                }else{  
                    if (stack.isEmpty()) {  
                         
                        stack.push(str);     
                    }else{  
                       
                        if(precedence(stack.top())>=precedence(str)){  
                            //If the stack element priority priority is greater than the current element
                            while(!stack.isEmpty() && precedence(stack.top())>=precedence(str)){  
                                returnList.add(stack.pop());  
                            }  
                        }  
                        stack.push(str);  
                    }  
                }  
            }  
        }  
         
        while (!stack.isEmpty()) {  
            returnList.add(stack.pop());  
        }  
        return returnList;  
    }  
      
   
    public String caculate(List<String> rpnList){  
        Stack numberStack = new Stack();     
          
        int length=rpnList.size();     
        for(int i=0;i<length;i++){     
            String temp=rpnList.get(i);     
            if(isNumber(temp)){     
                numberStack.push(temp);     
            }else{     
                BigDecimal tempNumber1 = new BigDecimal(numberStack.pop(),this.mc);  
                     
                BigDecimal tempNumber2 = new BigDecimal(numberStack.pop(),this.mc);  
                     
                BigDecimal tempNumber = new BigDecimal("0",this.mc);  
                     
                if(temp.equals(OP1)){     
                    tempNumber=tempNumber2.add(tempNumber1);     
                }else if(temp.equals(OP2)){     
                    tempNumber=tempNumber2.subtract(tempNumber1);     
                }else if(temp.equals(OP3)){     
                    tempNumber=tempNumber2.multiply(tempNumber1);     
                }else if(temp.equals(OP4)){     
                    tempNumber=tempNumber2.divide(tempNumber1,     
                            precision,     
                            roundingMode);     
                }    
                numberStack.push(tempNumber.toString());     
                     
            }     
        }     
             
        return numberStack.pop();  
          
    }  
  
    public String caculate(){  
        return caculate(this.rpnList);  
    }  
      
    

    public static void main(String[] args){
       Problem2 me=null; 
       String inputNum=null;
       java.util.Scanner input=null;
      
       java.text.DecimalFormat df=new java.text.DecimalFormat("#0.0"); 
       input=new java.util.Scanner(System.in);
       System.out.println("Input quit can exit");
       while(true)
       {
    	   System.out.print("Input:");   
    	   input=new java.util.Scanner(System.in);
    	   inputNum=input.nextLine();
    	   me= new Problem2(inputNum);
    	   if(!inputNum.equals("quit")){		     
    		   String output=df.format(Double.parseDouble(me.caculate()));  
    		   
    		   System.out.println("Output:"+output); 
    	   }else{
    		   
    		   input.close();
    		   System.out.println("exit success"); 
    		   break;
    	   }
       }
       
    }  
    
   
	    private class Stack {  
          
        LinkedList<String> stackList = new LinkedList<String>();  
     
        public Stack() {  
          
        }  
     
        public void push(String expression) {  
            stackList.addLast(expression);  
        }  
     
        public String pop() {  
            return stackList.removeLast();  
        }  
        
        public String top() {  
            return stackList.getLast();  
        }  
     
        public boolean isEmpty() {  
            return stackList.isEmpty();  
        }  
 }  
}
