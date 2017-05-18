$(document).ready(function(){
	var estadoscivis = getEstadoscivil();
	var formacao = getFormacao_Academica();
	var ufs = getEstados();
});

var baseUrl = "http://localhost:8080";

var getEstadoscivil = function(){
	getJSON(baseUrl + "/estadoscivis", {}, function(response){
		$("select[name='estadocivil']").find('option:not(:first)').remove();
		var select = $("select[name='estadocivil']");
		$.each(response, function(index, value){
			select.append("<option value='"+value.idestadocivil+"'>"+value.dsestadocivil+'</option>');
		});
	});
}

var getFormacao_Academica = function(){
	getJSON(baseUrl + "/formacaoacademica", {}, function(response){
		$("select[name='formacao']").find('option:not(:first)').remove();
		var select = $("select[name='formacao']");
		$.each(response, function(index, value){
			select.append("<option value='"+value.idformacaoacademica+"'>"+value.dsformacaoacademica+'</option>');
		});
	});
}

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