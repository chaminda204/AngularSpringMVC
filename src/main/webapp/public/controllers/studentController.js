'use strict';

/* Controllers */

var studetModule = angular.module('studentModule', []);

studetModule.controller('StudentCtrl', [
		'$scope',
		'$http',
		function($scope, $http) {
			$http.get('rest/getAllStudents')
					.success(function(data) {
						$scope.students = data;
					});
		} ]);

studetModule.controller('StudentCtrlUpd', [
		'$scope',
		'$routeParams',
		'$http',
		function($scope, $routeParams, $http) {
			$http.get('rest/student/'+ $routeParams.studentId).success(function(data) {
				$scope.student = data;
			});
		} ]);

/*
 * studentController.controller('StudentCtrlNew', ['$scope', function($scope,
 * $routeParams, $http) { $scope.student = ""; }); } ]);
 */
