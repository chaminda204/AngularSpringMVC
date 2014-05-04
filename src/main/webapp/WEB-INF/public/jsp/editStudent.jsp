<div>
	<form name="studentForm">
		<label>First Name </label>
		 <input type="text" class="span3"  ng-model="student.firstName" required size="30">
		<br> 
		<label>Last Name </label>
		 <input type="text" class="span3" ng-model="student.lastName" size="30">
		 <br> 
		<label>Email Address</label>
		<!--  <input type="email" ng-model="student.email" size="40">   -->
		<div class="input-prepend">
			<span class="add-on"><i class="icon-envelope"></i></span>
			<input class="span3" id="inputIcon" ng-model="student.email" type="text">
		</div>
		<br>
		<label>Notes</label>
		<textarea rows="2" cols="3" ng-model="student.notes"></textarea>
		 <br> 
		 <br>
		 <a href="#/" class="btn">Cancel</a>
		<button ng-click="save()" ng-disabled="studentForm.$invalid" class="btn btn-primary">Save</button>
		<button ng-click="destroy()" ng-show="student.$remove" class="btn btn-danger">Delete</button>	
	</form>
</div>