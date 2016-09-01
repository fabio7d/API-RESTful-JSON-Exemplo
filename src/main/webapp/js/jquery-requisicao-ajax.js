$(document).ready(function(){
       $("button").click(function(){
    	   
    	   $.ajax({
    		    url: '/apirestful-json-exemplo/webapi/pessoa',
    		    type: "GET",
    		    dataType: "json",
    		    success: function (data) {
 				   // alert(data) //para exibir que chegou o JSON;
    		    	
    		    	    $.exibirDadosFormatoJson(data);
    		       		//exibirJsonList(data);
    		      
    		        debugger;
    		    },
    		    error: function(result) {
                    alert("dado não encontrado");
                    debugger;
                }
    	   
    		});
       });
       
       
       $.exibirDadosFormatoJson = function (data){ 
    	   
      	jsonStr = JSON.stringify(data),
   	    regeStr = '',
   	    f = { brace: 0 }; // for tracking matches, in particular the curly braces

   	regeStr = jsonStr.replace(/({|}[,]*|[^{}:]+:[^{}:,]*[,{]*)/g, function (m, p1) {
   	    var rtnFn = function() {
   	            return '<div style="text-indent: ' + (f['brace'] * 20) + 'px;">' + p1 + '</div>';
   	        },
   	        rtnStr = 0;
   	    if (p1.lastIndexOf('{') === (p1.length - 1)) {
   	        rtnStr = rtnFn();
   	        f['brace'] += 1;
   	    } else if (p1.indexOf('}') === 0) {
   	        f['brace'] -= 1;
   	        rtnStr = rtnFn();
   	    } else {
   	        rtnStr = rtnFn();
   	    }
   	    return rtnStr;
   	});

   	document.getElementById('regeStr').innerHTML += regeStr;  
   }
      
}); //index.jsp



