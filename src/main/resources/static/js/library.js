var surfix = "http://localhost:8080";


$(document).ready(function (){
    $('#create').on('click',function (){
        var name = $('.name').val();
        var company = $('.company-name').val();
        var email = $('.email').val();
        var phone = $('.phone').val();

        if(name.length==0){
            alert("Please enter your name");
        }
        else {
            fetch(surfix+'/createLibrary',{
                method:"POST",
                headers:{"Accept":"application/json, text/plain, */*","Content-type":"application/json"},
                body:JSON.stringify({"name":""+name+"","company":""+company+"","email":""+email+"","telephone":""+phone+""})
            })
                .then(Response => Response.json())
        .then(data => {
                if(data.length==0){
                alert("Error during creation");
                location.reload();
            }
        else {
                alert("Success!");
                location.reload();
            }

        });
        }
    })
});