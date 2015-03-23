'use strict';

/* Controllers */

var studentController = angular.module('studentController', []);

studentController.controller('StudentCtrl', [
		'$scope',
		'$http',
		function($scope, $http) {
			$http.get(
					'http://localhost:8080/StudentService/rest/getAllStudents')
					.success(function(data) {
						$scope.students = data;
					});
		} ]);

studentController.controller('StudentCtrlUpd', [
		'$scope',
		'$routeParams',
		'$http',
		function($scope, $routeParams, $http) {
			$http.get(
					'http://localhost:8080/StudentService/rest/student/'
							+ $routeParams.studentId).success(function(data) {
				$scope.student = data;
			});
		} ]);

/*
 * studentController.controller('StudentCtrlNew', ['$scope', function($scope,
 * $routeParams, $http) { $scope.student = ""; }); } ]);
 */
