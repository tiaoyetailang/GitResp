<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/11/17
  Time: 18:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"   %>
<html>
<head>
    <title>愚公列表</title>
    <%
        pageContext.setAttribute("bb",request.getContextPath());
        pageContext.setAttribute("ba",request.getContextPath());
        session.setAttribute("maya","maya");

    %>
    <script type="text/javascript" src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<%--    <script type="text/javascript" src="${ba}/static/js/jquery-1.7.2.js"></script>--%>
    <link href="${ba}/static/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
    <script src="${ba}/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>

<a href="${ba}/baba">${sessionScope.get("maya")}123</a>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">员工添加</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Empname</label>
                        <div class="col-sm-10">
                            <input type="text" name="name" class="form-control" id="emp_name" placeholder="empname">
                            <span  class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Email</label>
                        <div class="col-sm-10">
                            <input type="text" name="email" class="form-control" id="emp_email" placeholder="email">
                            <span  class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Gender</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="emp_gender1" value="M"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="emp_gender2" value="F"> 女
                            </label>
                        </div>
                    </div>

                    <div class="form-group">
                    <label  class="col-sm-2 control-label">deptName</label>
                    <div class="col-sm-10">
                        <select class="form-control" name="did" id="dept_select">

                        </select>
                    </div>
            </div>


                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" id="emp_save">Save changes</button>
            </div>
        </div>
    </div>
</div>


<!-- Modal -->
<div class="modal fade" id="Update" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" >员工修改</h4>
            </div>
            <div class="modal-body">
                <form class="form-horizontal">
                    <div class="form-group">
                        <label  class="col-sm-2 control-label" >Empname</label>
                        <div class="col-sm-10">
                            <p class="form-control-static" id="emp_update_static" ></p>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Email</label>
                        <div class="col-sm-10">
                            <input type="text" name="email" class="form-control" id="emp_email_update" placeholder="email">
                            <span  class="help-block"></span>
                        </div>
                    </div>
                    <div class="form-group">
                        <label  class="col-sm-2 control-label">Gender</label>
                        <div class="col-sm-10">
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="emp_gender1_update" value="M"> 男
                            </label>
                            <label class="radio-inline">
                                <input type="radio" name="gender" id="emp_gender2_update" value="F"> 女
                            </label>
                        </div>
                    </div>

                    <div class="form-group">
                        <label  class="col-sm-2 control-label">deptName</label>
                        <div class="col-sm-10">
                            <select class="form-control" name="did" id="eee">

                            </select>
                        </div>
                    </div>


                </form>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                <button type="button" class="btn btn-primary" id="emp_update">修改</button>
            </div>
        </div>
    </div>
</div>


<%--显示页面--%>
<div class="container">
    <%--   标题 --%>
    <div class="row">
        <div class="col-md-12">
            <h1>SSM-curd</h1>
        </div>
    </div>
    <%--按钮--%>
    <div class="row">
        <div class="col-md-4 col-md-offset-8">
            <button class="btn btn-primary" id="emp_ad_model_btn">新增</button>
            <button class="btn btn-danger" id="delete_all">删除</button>
        </div>

    </div>
    <%--显示表格数据--%>
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover" id="emps_table">
                <thead>
                <tr>
                    <th>
                        <input type="checkbox" id="check_all">
                    </th>
                    <th>#</th>
                    <th>empname</th>
                    <th>gender</th>
                    <th>email</th>
                    <th>deptname</th>
                    <th>操作</th>

                </tr>
                </thead>
                  <tbody>



                  </tbody>

            </table>

        </div>
    </div>
    <%--分页栏--%>
    <div class="row">
        <div class="col-md-6" id="page_info_area">

        </div>

        <div class="col-md-6" id="page_info_nav">


        </div>
    </div>

</div>
<script type="text/javascript">

    $(function () {
        to_page(1);
    });

    function to_page(pn) {
        $.ajax({
            url:"${ba}/emps",
            data:"pn="+pn,
            type:"get",
            success:function (result) {
                build_emps_table(result);
                build_emps_info(result);
                build_emps_nav(result);
            }
        });
    }
    
    function build_emps_table(result) {
            $("#emps_table tbody").empty();

          var emps=result.extend.pageInfo.list;
          $.each(emps,function (index,item) {
              var check=$("<input type='checkbox' class='check_item'>");
              var empid=$("<td></td>").append(item.id);
              var empname=$("<td></td>").append(item.name);
              var gender=$("<td></td>").append(item.gender);
              var email=$("<td></td>").append(item.email);
              var dept=$("<td></td>").append(item.dept.deptname);
              /**
               *  <button class="btn btn-primary btn-sm">
               <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>
               编辑</button>
               * <button class="btn btn-danger btn-sm">

               删除</button>
               */
              var edit=$("<button></button>").addClass("btn btn-primary btn-sm edit_btn")
                          .append($("<span></span>").addClass("glyphicon glyphicon-pencil")).append("编辑");
              edit.attr("edit_id",item.id);
              var deleted=$("<button></button>").addClass("btn btn-danger btn-sm delete_btn").append("删除");
              deleted.attr("del-id",item.id)
               $("<tr></tr>").append(check).append(empid).append(empname)
                   .append(gender).append(email).append(dept).append(edit).append(deleted).appendTo("#emps_table tbody");
          });
    }
    //解析信息
    function build_emps_info(result) {
        $("#page_info_area").empty();
    $("#page_info_area").append(" 当前"+result.extend.pageInfo.pageNum+"页,总共"+ result.extend.pageInfo.pages+"页,总共"+ result.extend.pageInfo.total+"记录")
                child=result.extend.pageInfo.pageNum;
    }
//分页
    function build_emps_nav(result) {
        $("#page_info_nav").empty();
        var ul=$("<ul></ul>").addClass("pagination");

           var first=$("<li></li>").append($("<a></a>").append("首页").attr("href","#"));

           var pre=$("<li></li>").append($("<a></a>").append("上一页"));

        if(result.extend.pageInfo.hasPreviousPage==false){
            first.addClass("disabled");
            pre.addClass("disabled")
        }else{
            pre.click(function () {
                to_page(result.extend.pageInfo.pageNum-1);
            });
            first.click(function () {
                to_page(1);
            })

        }
           var next=$("<li></li>").append($("<a></a>").append("下一页"));

           var last=$("<li></li>").append($("<a></a>").append("末页").attr("href","#"));

        if(result.extend.pageInfo.hasNextPage==false){
            next.addClass("disabled");
            last.addClass("disabled");
        }else {
            next.click(function () {
                to_page(result.extend.pageInfo.pageNum+1);
            });
            last.click(function () {
                to_page(result.extend.pageInfo.pages);
            })

        }
           ul.append(first).append(pre);
           $.each(result.extend.pageInfo.navigatepageNums,function (index,item) {

                 var num=$("<li></li>").append($("<a></a>").append(item));
                 if(result.extend.pageInfo.pageNum==item){
                     num.addClass("active")
                 }
                 num.click(function () {
                     to_page(item);
                 });
                 ul.append(num)
           })
        ul.append(next).append(last);
           var nav=$("<nav></nav>").append(ul);
           nav.appendTo("#page_info_nav");
    }

$("#emp_ad_model_btn").click(function () {
    $("#myModal form")[0].reset();
    $("#myModal").removeClass("has-error has-success")
   getDepts("#myModal select");
 $("#myModal").modal({
     backdrop:"static"
 });
})

    function getDepts(ele) {
        $(ele).empty();
         $.ajax({
             url:"${ba}/depts",
             type: "GET",
             success:function (result) {
             $("#myModal select").empty();
                 $.each(result.extend.depts,function () {
                     var op=$("<option></option>").append(this.deptname).attr("value",this.deptid);
                     op.appendTo(ele);
                 })
             }


         })
    }

     function check_name(){

          var name=$("#emp_name").val();
          if(name==123){
              showq("#emp_name","error","用户名不正确")

              return false;
          }else {
              showq("#emp_name","success","用户名正确")

          }

          var email=$("#emp_email").val();
          if(email==123){
              showq("#emp_email","error","email不正确")
              return false;
          }else{
              showq("#emp_email","success","email正确")

          }
          return true;

     }
     function showq(ele,statu,msg){
         $(ele).parent().removeClass("has-success has-error")
         $(ele).next("span").text("");
        if(statu=="success"){
            $(ele).parent().addClass("has-success");
            $(ele).next("span").text(msg);
        }else{
            $(ele).parent().addClass("has-error");
            $(ele).next("span").text(msg);
        }

     }



    $("#emp_save").click(function () {

        if($(this).attr("ajax-va")=="error") {
            return false;
        }

      if(!check_name()){
          return false;
      }


        $.ajax({
            url:"${ba}/emp",
            type:"Post",
            data:$("#myModal form").serialize(),
            success:function (result) {
                  $("#myModal").modal('hide');
                to_page(999999);
            }

        });
    });

    $("#emp_name").change(function () {
              if($(this).val()!=12){
                  showq("#emp_name","success","对的");
                  $("#emp_save ").attr("ajax-va","success")
              }else{
                  showq("#emp_name","error","错的");
                  $("#emp_save ").attr("ajax-va","error")


              }

    })
    $(document).on("click",".edit_btn",function () {
        getDepts("#Update select");
        getEmp($(this).attr("edit_id"));
         $("#emp_update").attr("edit-id",$(this).attr("edit_id"));
        $("#Update").modal({
            backdrop:"static"
        });
    })


    $(document).on("click",".delete_btn",function () {
            var empname=$(this).parents("tr").find("td:eq(1)").text();
            var id= $(this).attr("del-id");
                     if(confirm("确认删除"+empname+"吗")){
                         $.ajax({
                             url:"${ba}/emp/"+id,
                             type:"POST",
                             data:"_method=DELETE",
                             success:function (result) {
                                 to_page(child);
                             }

                         })
                     }
    })



    function getEmp(id) {
        $.ajax({
                url:"${ba}/emp/"+id,
            type:"GET",
            success:function (result) {
                var emp=result.extend.emp;
                $("#emp_update_static").text(emp.name);
                $("#emp_email_update").val(emp.email);
                   $("#Update select").val(emp.did)
            }

        })

    }

    $("#emp_update").click(function () {
     var id=   $(this).attr("edit-id")
                  $.ajax({
                      url:"${ba}/emp/"+$(this).attr("edit-id"),
                      type:"POST",
                      data:$("#Update form").serialize()+"&_method=PUT",
                      success:function (result) {
                                 alert(result.msg);
                          $("#Update").modal("hide");
                          to_page(child);
                      }
                  })

    });

    $("#check_all").click(function () {
           $(".check_item").prop("checked",$(this).prop("checked"));
    })
    $(document).on("click",".check_item",function () {

          $("#check_all").prop("checked",$(".check_item:checked").length==$(".check_item").length);



    })
    $("#delete_all").click(function () {


                  if(confirm("确认删除吗")){
                      $.ajax({
                          url:"${ba}/emp/"+id,
                          type:"POST",
                          data:"_method=DELETE",
                          success:function (result) {
                             alert("成功");
                              to_page(child);
                          }

                      })
                  }
    })


</script>

</body>
</html>
