<script src="/javascript/controller/product.js"></script>
<section>
	<h1>Products</h1>

	<ul>
		<li data-ng-repeat="product in productCtrl.products">
			{{product.name}}
		</li>
	</ul>
</section>