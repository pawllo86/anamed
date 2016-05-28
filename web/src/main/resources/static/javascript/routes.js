'use strict';

angular.module("appAnamed").config(function($routeProvider, $locationProvider) {
	$routeProvider
		.when('/', {
			templateUrl: '/routes/main'
		})
		.when('/product', {
			templateUrl: '/routes/product',
			controller: 'ProductController',
			controllerAs: 'productCtrl'			
		})
		.when('/user', {
			templateUrl: '/routes/user'
		})
		.otherwise({
			redirectTo: '/'
		});
	
	$locationProvider.html5Mode({enabled: true, requireBase: false});
	
});