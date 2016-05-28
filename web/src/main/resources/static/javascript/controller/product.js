'use strict'

angular.module('appAnamed').controller('ProductController', function($http) {
	var controller = this;
	
	$http({method: 'GET', url: '/product/all'}).then(
			function(response) {
				controller.products = response.data;
			},
			function(response) {
				allert('Product data not available!' + response.status);
			});	
});