angular.module('app').controller("LoginController", ['$scope', '$http','Service', '$state',
		function ($scope, $http, Service, $state) {
	
	console.log("Running")
	
	$scope.loginUser = function(){
				
		var userCredentials = {"id": $scope.user, "password": $scope.password};
		
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