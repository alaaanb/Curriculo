var extensions = function() {
	if (!String.prototype.format) {
		String.prototype.format = function() {
			var args = arguments;
			return this.replace(/{(\d+)}/g, function(match, number) {
				return typeof args[number] != 'undefined' ? args[number] : match;
			});
		};
	}

	if (!String.format) {
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

	$scope.entrar = function(login) {
		$http.post("/Curriculo/login", login).success(function(data) {
			
			console.log(data);
			
			//window.location.href = "/Curriculo/{0}".format(data.page);
		});
	};
});