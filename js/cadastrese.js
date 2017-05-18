$(document).ready(function(){
	
	$("input[name='BtnSalvar']").on('click', function(e){
		e.preventDefault;
		submit($("form[name='meu_form']").serializeJSON());
		
	});
});

var baseUrl = "http://localhost:8080";

var submit = function (form) {
	console.log(form);
	$.ajax({
		type: "POST",
		url:baseUrl+"/cadastro/candidato",
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

$(document).ready(function(){
	var ufs = getEstados();
});

var baseUrl = "http://localhost:8080";

var getEstados = function () {
	getJSON(baseUrl + "/ufs", {}, function (response){
		$("select[name='estado']").find('option:not(:first)').remove();
		var select = $("select[name='estado']");
		$.each(response, function (index, value){
			select.append("<option value='"+value.iduf+"'>"+value.dsuf+'</option>');
		});
	});
}


var getJSON = function(url, params, callback){
	return $.getJSON(url, params, callback);
}