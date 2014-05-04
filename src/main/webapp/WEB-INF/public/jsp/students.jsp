
<!-- Data grid -->
<div class="row-fluid">

	<div class="span12">
		<div class="span12">
			Search: <input class="search-query" ng-model="query">
		</div>
		<br>
		<br>
		<table ng-show="students.length > 0"
			class="table table-striped table-bordered table-condensed table-responsive"
			style="">
			<thead>
				<tr>
					<th width="15%">Student ID</th>
					<th width="25%">First Name</th>
					<th width="25%">Last Name</th>
					<th width="30%">Email</th>
					<th width="5%"><a href="#/newStudent"><i class="icon-plus-sign"></i></a></th>
				</tr>
			</thead>
			<tbody>
				<tr
					ng-repeat="student in students |filter:query | orderBy:predicate:reverse">
					<td>{{student.studentId}}</a></td>
					<td>{{student.firstName}}</a></td>
					<td>{{student.lastName}}</td>
					<td>{{student.email}}</td>
					<td><a href="#/student/{{student.studentId}}"><i class="icon-pencil"></i></a></td>
				</tr>
			</tbody>
		</table>
	</div>
</div>