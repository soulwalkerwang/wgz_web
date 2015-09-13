/**
 * Created by wgz on 1/24/2015.
 */
function jqverify()
{

    $.get("AjaxServlet?name=" + $("#userName").val(),null, function (data)
    {
        $("#result").html(data);
    });

}

function jqxmlverify()
{

    $.get("AjaxXMLServlet?name=" + $("#userName").val(),null, function (data)
    {
        var messageNodes = $(data).find("message");
        alert(messageNodes);
        var responseMessage = messageNodes[0].firstChild;
        $("#result").html(responseMessage.nodeValue);
    });

}

function jqxmlverify2()
{

    $.ajax(
        {
            type : "GET",
            url : "AjaxXMLServlet",
            data : "name=" + $("#userName").val(),
            dataType : "xml",
            success : function (data) {
                var messageNodes = $(data).find("message");
                alert(messageNodes);
                var responseMessage = messageNodes[0].firstChild;
                $("#result").html(responseMessage.nodeValue);
            }
        }
    );

}

function jsverify()
{
    var userName = document.getElementById("userName").value;

    var xhr = new XMLHttpRequest();



    xhr.onload = function()
    {
        if(xhr.status === 200)
        {
            document.getElementById("result").innerHTML = xhr.responseText;

        }
    };

    xhr.open('GET', "AjaxServlet?name=" + userName, true);
    xhr.send();
}