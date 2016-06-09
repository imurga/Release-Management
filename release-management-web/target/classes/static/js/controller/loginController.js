angular.module('app').controller("LoginController", ['$scope', '$http','Service', '$state', '$rootScope',
		function ($scope, $http, Service, $state, $rootScope) {
	
	console.log("Running")
	
	$rootScope.showNav = false;
	
	$scope.loginUser = function(){
				
		//var userCredentials = {"id": $scope.user, "password": $scope.password};
		var userCredentials = {"id": 'imurga', "password": 'imurga'};
		
		console.log(userCredentials);
		
		Service.getUserLoginInformation(userCredentials)
		.then(function successCallback(response) {
			console.log (response);
			$state.go('app.board');
			if (response.success) {
				console.log('heee');
			}
		  }, function errorCallback(response) {
			  console.log("error");
		  });
		
	}
	
}]);