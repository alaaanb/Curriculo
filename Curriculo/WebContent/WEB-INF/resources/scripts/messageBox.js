var TYPE_SUCCESS = "success";
var TYPE_ERROR = "error";
var TYPE_INFO = "info";
var TYPE_WARNING = "warning";

var PANEL_SUCCESS = "panel panel-success";
var PANEL_ERROR = "panel panel-danger";
var PANEL_INFO = "panel panel-info";
var PANEL_WARNING = "panel panel-warning";

var BUTTON_SUCCESS = "btn btn-success";
var BUTTON_ERROR = "btn btn-danger";
var BUTTON_INFO = "btn btn-info";
var BUTTON_WARNING = "btn btn-warning";

function showSuccessMessage(message, callback) {
	showMessageBox(TYPE_SUCCESS, message, null, null, null, callback);
}

function showErrorMessage(message, callback) {

}

function showInfoMessage(message, callback) {

}

function showWarningMessage(message, callback) {

}

function showMessageBox(type, message, buttons, command, parameters, callback) {

	if (type == TYPE_SUCCESS)
	{
		$("#messageBoxPanel").addClass(PANEL_SUCCESS);
		$("#messageBoxTitle").append("Sucesso");
	}

	$("#messageBoxMessage").append(message);
	$("#messageBox").modal("show");
}

angular.module("curriculo").controller("messageBoxController", function($scope) {
	$scope.modal = {
		message : "",
		title : "",
	};
});
