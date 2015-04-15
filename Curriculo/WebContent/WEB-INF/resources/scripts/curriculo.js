var extensions = function() {
	if (!String.prototype.format)
	{
		String.prototype.format = function() {
			var args = arguments;
			return this.replace(/{(\d+)}/g, function(match, number) {
				return typeof args[number] != 'undefined' ? args[number] : match;
			});
		};
	}

	if (!String.format)
	{
		String.format = function(format) {
			var args = Array.prototype.slice.call(arguments, 1);
			return format.replace(/{(\d+)}/g, function(match, number) {
				return typeof args[number] != 'undefined' ? args[number] : match;
			});
		};
	}
}();

angular.module("curriculo", []);
angular.module("curriculo").controller("indexController", function($scope, $http, $location) {

	$scope.titulo = "Currículo - Spring MVC";
	$scope.entrar = function(login) {
		try
		{
			$http.post("/Curriculo/login", login).success(function(data) {

				if (data.hasErrorList == false)
				{
					showSuccessMessage(data.errorMessage);
				}
				else
				{
					window.location.href = "/Curriculo/home";
				}
			}).error(function(data, status) {

				console.log("Erro: ");
				console.log(data);
				console.log("Status: ");
				console.log(status);

			});
		}
		catch (e)
		{
			console.log(e);
		}
	};
});