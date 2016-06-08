angular.module('app').controller("BoardController", ['$scope', '$http', 'Service', '$state',
		function ($scope, $http, Service, $state) {
	
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
		$state.go('app.environment');
	}
	
	Service.getEnvironmentList()
	.then(function successCallback(response) {
		console.log (response);
	  }, function errorCallback(response) {
		  console.log("error");
	  });
}]);