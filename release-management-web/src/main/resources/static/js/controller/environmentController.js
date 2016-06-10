angular.module('app').controller("EnvironmentController", ['$scope', '$http', 'Service', '$state', '$rootScope',
		function ($scope, $http, Service, $state, $rootScope) {
	$rootScope.showNav = true;
	$scope.variable1 = {
		"name": '',
		"value": '',
	};
	$scope.variable2 = {
		"name": '',
		"value": '',
	};
	$scope.variable3 = {
		"name": '',
		"value": '',
	};
	
	$scope.environments = {
			
	};
        
	$scope.addEnvironmentView = function(){
		$state.go('app.newEnvironment');
	}
	
	$scope.returnEnvironment = function(){
		$state.go('app.environment');
	}
	
	$scope.saveEnvironment = function(){
		
		$scope.env = {
				"name": $scope.name,
				"description": $scope.description,
				"enable": true,
				"release": $scope.release,
				"variable1": $scope.variable1,
				"variable2": $scope.variable2,
				"variable3": $scope.variable3
		};
		
		console.log($scope.env);
		
		Service.saveEnvironment($scope.env)
		.then(function successCallback(response) {
			console.log (response);
			$state.go('app.environment');
		  }, function errorCallback(response) {
			  console.log("error");
		  });
		
	}
	
	Service.getEnvironmentList()
	.then(function successCallback(response) {
		$scope.environments = response.data;
		console.log (response);
	  }, function errorCallback(response) {
		  console.log("error");
	  });
	
	Service.getReleaseList()
	.then(function successCallback(response) {
		console.log(response);
		$scope.releaseList = response.data;
	  }, function errorCallback(response) {
		  console.log("error");
	  });
}]);