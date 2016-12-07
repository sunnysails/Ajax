/**
 *
 * Created by sunny on 2016/12/7.
 */
(function(){
    document.querySelector("#btn").onclick = function () {
        var xmlHttp = new XMLHttpRequest();
        xmlHttp.open("get","/data.json");
        xmlHttp.onreadystatechange = function () {
            if (xmlHttp.readyState == 4 ){
                if (xmlHttp.status == 200 ){
                    var result = xmlHttp.responseText
                    // var json = JSON.parse(result)
                    alert(result.length)
                }
            }
        };
        xmlHttp.send();
    };
})();