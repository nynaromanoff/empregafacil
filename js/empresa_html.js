$(document).ready(function(){
	var quantidadefuncionarios = getQuantidadeFun();
});

var baseUrl = "http://localhost:8080";

var getQuantidadeFun = function () {
	getJSON(baseUrl + "/quantidadefuncionarios", {}, function (response){
		$("select[name='day']").find('option:not(:first)').remove();
		var select = $("select[name='day']");
		$.each(response, function (index, value){
			select.append("<option value='"+value.idqtdfuncionario+"'>"+value.dsqtdfuncionario+'</option>');
		});
	});
}

var getJSON = function(url, params, callback){
	return $.getJSON(url, params, callback);
}