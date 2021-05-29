var surfix = "http://localhost:8080";


$(document).ready(function () {
    $('#create').on('click', function () {
        var email = $('.email').val();
        var password = $('.password').val();

        if((email.length==0)||(password.length==0)){
            alert("Error with password or email field");
        }
        else {
            fetch(surfix+'/createUser',{
                method:"POST",
                headers:{"Accept":"application/json, text/plain, */*","Content-type":"application/json"},
                body:JSON.stringify({"email":""+email+"","password":""+password+""})
            })
                .then(Response => Response.json())
                .then(data => {
                    if(data.length==0){
                        alert("Error during creation");
                        location.reload();
                    }
                    else {
                        alert("Success!");
                        document.location.href=surfix+"/login";
                    }

                });
        }
    });

});