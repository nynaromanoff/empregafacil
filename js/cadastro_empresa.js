$(document).ready(function(){
	
	$("input[name='btnSalvar']").on('click', function(e){
		e.preventDefault;
		submit($("form[name='meuform']").serializeJSON());
		
	});
});

var baseUrl = "http://localhost:8080";

var submit = function (form) {
	console.log(form);
	$.ajax({
		type: "POST",
		url:baseUrl+"/cadastro/empresa",
		contentType:"application/json",
		data:form,
		async:true,
		success:function(data) {
			console.log(data);
			console.log('cadastro realizado com sucesso!');
		},
		error:function(err){
			console.error('Não foi possível realizar o cadastro!');
		}
	});
}

var validarFormulario = function() {
	return true;
}

function objectifyForm(formArray) {//serialize data function

  var returnArray = {};
  for (var i = 0; i < formArray.length; i++){
    returnArray[formArray[i]['name']] = formArray[i]['value'];
  }
  return returnArray;
}