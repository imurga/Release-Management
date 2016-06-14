angular.module('app').controller("BoardController", ['$scope', '$http', 'Service', '$state', '$rootScope', 
function ($scope, $http, Service, $state, $rootScope) {
	
	$rootScope.showNav = true;
    
	$scope.addReleaseView = function(){
		$state.go('app.newRelease');
	}
	
	$scope.returnRelease = function(){
		$state.go('app.board');
	}
	
	$scope.init = function(){
			Service.getReleaseList()
			.then(function successCallback(response) {
				console.log(response);
				$scope.releaseList = response.data;
			  }, function errorCallback(response) {
				  console.log("error");
			  });
	};
	
	$scope.init();
	
	
	$scope.saveRelease = function(){
		
		$scope.release = {
				"name": $scope.name,
				"version": $scope.version,
				"type": $scope.type,
				"url": $scope.url,
				"branch": $scope.branch,
				"jiraUrl": $scope.jiraUrl,
				"jenkinsUrl": $scope.jenkinsUrl,
		};
		
		console.log($scope.release);
		
		Service.saveRelease($scope.release)
		.then(function successCallback(response) {
			console.log (response);
			$state.go('app.board');
		  }, function errorCallback(response) {
			  console.log("error");
		  });
	}
	$scope.releaseList = {};
	
	$scope.deleteRelease = function(id) {
		
		var release = {"id": id};
		
		console.log(release);
		
		Service.deleteRelease(release)
		.then(function successCallback(response) {
			$scope.releaseList.splice(id, 1);
		  }, function errorCallback(response) {
			  console.log("error");
		  });
	}
}]);