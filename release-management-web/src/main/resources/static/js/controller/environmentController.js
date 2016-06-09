angular.module('app').controller("EnvironmentController", ['$scope', '$http', 'Service', '$state', '$rootScope',
		function ($scope, $http, Service, $state, $rootScope) {
	$rootScope.showNav = true;
	var imagePath = 'img/icon_environments.png';
    $scope.environments = [
    {
      path : imagePath,
      name: 'DEV',
      description: " Environment for DEV"
    },
    {
      path : imagePath,
      name: 'TEST',
      description: " Environment for TEST"
    },
    {
      path : imagePath,
      name: 'QA',
      description: " Environment for QA"
    }
  ];
        
	$scope.addEnvironmentView = function(){
		$state.go('app.newEnvironment');
	}
	
	Service.getEnvironmentList()
	.then(function successCallback(response) {
		console.log (response);
	  }, function errorCallback(response) {
		  console.log("error");
	  });
	
}]);