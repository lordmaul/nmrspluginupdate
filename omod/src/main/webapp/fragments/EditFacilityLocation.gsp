<%
def id = config.id
%>
<%= ui.resourceLinks() %>


<div class="row wrapper  white-bg page-heading"  style="">
    <div class="col-lg-8 offset-lg-2">

        <div class="panel panel-flat">

            <div class="panel-heading" style="padding:10px 20px">


                <h5>
                    <br/>
                    <input style="width: 40%;font-size: 16px; padding: 12px 20px 12px 40px; border: 1px solid #ddd; margin-bottom: 12px;" class="heading-text pull-left" type="text" id="nameSearch" onkeyup="myFunction()" placeholder="Search..">

                    <br/><br/>
                </h5>

            </div>

        </div>
        <div class="table-responsive">
            <table class="table table-striped table-bordered  table-hover" id="edit_facility_locations">
                <thead>
                    <tr>
                        <th>${ ui.message("Location ID") }</th>
                        <th>${ ui.message("Location Name") }</th>
                        <th>${ ui.message("Action") }</th>

                    </tr>
                </thead>
                <tbody id="TableBody">




                </tbody>
            </table>

        </div>

    </div>
</div>

<script>
    function myFunction() {
    // Declare variables 
    var input, filter, table, tr, td, i, txtValue;
    input = document.getElementById("nameSearch");
    filter = input.value.toUpperCase();
    table = document.getElementById("edit_facility_locations");
    tr = table.getElementsByTagName("tr");

    // Loop through all table rows, and hide those who don't match the search query
    for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td");

    for (var j = 0; j < td.length; j++) {
    cell = tr[i].getElementsByTagName("td")[j];
    if (cell) {
        if (cell.innerHTML.toUpperCase().indexOf(filter) > -1) {
    tr[i].style.display = "";
    break;
    }
    else {
    tr[i].style.display = "none";
    }
    }
    } 

    }
    }
</script>

<script>
 
    jq = jQuery;
    jq('#wait').hide();
    jq(function() {
       
    jq('#gen-wait').show();

    jq.ajax({
        url: "${ ui.actionLink("nigeriaemr", "ndr", "getAllLocation") }",
    dataType: "json",
  
    

    }).success(function(data) {
    jq('#gen-wait').hide();
    console.log(data);
     
    var obj = jq.parseJSON(data);

     console.log(obj.length);
     console.log(obj);
     
    
    if(obj !="")
    {
    
        for(var i=0;i<obj.length;i++)
        {
            facilityID = obj[i].locationId+'';
            editButton = '<button type="Reload List" class="btn btn-primary heading-text" style="width: 80%;" onclick="editLocation(' + facilityID + ')">'+"Edit"+'</button>';
            jq('#TableBody').append("<tr><td>"+obj[i].locationId+"</td><td>"+obj[i].locationName+"</td><td>"+editButton+"</td></tr>");

        }
    
    }
    
    })
    .error(function(xhr, status, err) {
    jq('#gen-wait').hide();
    alert('An error occured');

    }); 

    });

</script>
