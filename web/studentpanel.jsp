<%-- 
    Document   : studentpanel
    Created on : 2 Apr, 2019, 10:01:18 AM
    Author     : Garru don
--%>

<%@page import="modal.Route"%>
<%@page import="modal.RouteDAO"%>
<%@page import="modal.Driver"%>
<%@page import="modal.DriverDAO"%>
<%@page import="java.util.List"%>
<%@page import="modal.Student"%>
<%@page import="modal.StudentDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en" dir="ltr">
  <head>
    <meta charset="utf-8">
    <title>Student Panel</title>
      <script defer src="https://use.fontawesome.com/releases/v5.0.6/js/all.js"></script>
    <style>
      body {
        margin: 0px;
        border: 0px;
        background-color: black;
      }

      .content {


        background-color:black;
        font-size: 20px;
        color: red;
        text-align: center;

      }
      table {
        width:800px;
        margin:auto;
        text-align: center;
        table-layout: fixed;
background: red;
      }
      table, th, tr, td
      {
        padding: 20px;
        color:white;
        border: 1px solid #080808;
        border-collapse: collapse;
        font-size: 15px;
        font-family: sans-serif;
        background:linear-gradent(top,#3c3c3c 0%, #222222 100%);
        background:webkit-linear-gradent(top,#3c3c3c 0%, #222222 100%);

      }
      /* th,td{
        opacity: 1;
      } */
      tr:hover{
        background: orange;
      }

      .main{
        height: 40vh;
        width:100%;
        background-color:black;
        display: flex;
        justify-content: center;
        align-items: center;
      }
      @import url('https://fonts.googleapis.com/css?family=Germania+One');
      .main span{
        font-family: 'Germania One', cursive;
        font-size: 100px;
        font-weight: bolder;
        animation: animate infinite 2s linear;
        margin:0 20px;
        color: white;
      }
      .main span:nth-child(1){
        animation-delay: 0s;
      }
      .main span:nth-child(2){
        animation-delay: 0.2s;
      }
      .main span:nth-child(3){
        animation-delay: 0.4s;
      }
      .main span:nth-child(4){
        animation-delay: 0.6s;
      }
      .main span:nth-child(5){
        animation-delay: 0.8s;
      }
      .main span:nth-child(6){
        animation-delay: 1s;
      }
      .main span:nth-child(7){
        animation-delay: 1.2s;
      }
      @keyframes animate {
        0%{
          transform:scale(1);
          text-shadow: 0 0 0px black;
        }
        50%{

          transform:scale(1.4);
          text-shadow: 0 0 10px black,0 0 30px yellow,0 0 60px green ;
        }
        100%{

          transform:scale(1);
          text-shadow: 0 0 0px black;
        }
      }
      .bb{
      direction:center;
      
      }
      .bb{
        background-color:black;
        opacity:0.8;
        font-size:2em;
        padding:10px 50px;
        border:none;

      }
      .bb:hover{
        transform:translate(0,-5px);
        transition:0.5s;
        box-shadow: -2px 2px 2px lightseagreen,2px -2px 2px red;
      }
      a {
        text-decoration: none;
        color:white;
      }

      
.search-box {
 position: absolute;
 top: 50%;
 left: 50%;
 transform: translate(-50%, -50%);
 background: red;
 height: 40px;
 border-radius: 40px;
 padding: 10px;
}

.search-box:hover > .search-txt {
 width: 240px;
 padding: 0 6px;
}

.search-box:hover > .search-btn {
 background: white;
 color: black;
}

.search-btn {
 color: #e84118;
 float: right;
 width: 40px;
 height: 40px;
 border-radius: 50%;
 background: #2f3640;
 display: flex;
 justify-content: center;
 align-items: center;
 transition: 0.4s;
 color: white;
 cursor: pointer;
}

.search-btn > i {
 font-size: 30px;
}

.search-txt {
 border: none;
 background: none;
 outline: none;
 float: left;
 padding: 0;
 color: white;
 font-size: 16px;
 transition: 0.4s;
 line-height: 40px;
 width: 0px;
 font-weight: bold;
}﻿
    </style>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script>
    $(document).ready(function(){
      $("#srch").on("keyup", function() {
        var value = $(this).val().toLowerCase();
        $("#tbl tr").filter(function() {
          $(this).toggle($(this).text().toLowerCase().indexOf(value) > -1)
        });
      });
    });
    </script>
  </head>
  <body>
    <div class="main">
      <span>W</span>
        <span>E</span>
        <span>L</span>
        <span>C</span>
        <span>O</span>
        <span>M</span>
        <span>E</span>
    </div>

  <div class="content">
<br>
<div class="search-box">
    <input type="text" name="" id="srch" class="search-txt" placeholder="Type to search"/>

    <a class="search-btn" href="#">
    <i class="fas fa-search"></i>

    </a>

  </div>
<br>
      
      <br>
      <br>
<h2> Student Table</h2>

<br>
<table  border=5>
  <tr>
    
    <th>Name</th>
    <th>Id</th>
    <th>Route Id</th>
    <th>Phone no</th>
  </tr>
  <tbody id="tbl">
  <tr>
    <%
        StudentDAO s = new StudentDAO();
        List<Student> list = StudentDAO.getListOfStudent();
        for(Student s1 : list){
    %>
    
    <td><%=s1.getName()%></td>
    <td><%=s1.getId()%></td>
    <td><%=s1.getRoute_Id()%></td>
    <td><%=s1.getPhone_no()%></td>
  </tr>
<%}%>
  </tbody>
</table>

<h2> Driver Table</h2>

<br>
<table  border=5>
  <tr>
    <th> Driver Name</th>
    <th>Driver Id</th>
    <th>Route Id</th>
    <th>Phone no</th>
  </tr>
  
  <tbody id="tbl">
 <tr>
    <%
        DriverDAO s2 = new DriverDAO();
        List<Driver> list1 = DriverDAO.getListOfDriver();
        for(Driver stu : list1){
    %>
    
    <td><%=stu.getDriver_Name()%></td>
    <td><%=stu.getDriver_Id()%></td>
    <td><%=stu.getRoute_Id()%></td>
    <td><%=stu.getPhone_no()%></td>
  </tr>
<%}%>
  </tbody>
</table>

<h2>Route Table</h2>

<br>
<table  border=5>
  <tr>
    
    <th>Route Id</th>
    <th>Start</th>
    <th>Stop</th>
    <th>Driver Id</th>
  </tr>
  <tbody id="tbl">
<tr>
    <%
        RouteDAO s3 = new RouteDAO();
        List<Route> list2 = RouteDAO.getListOfRoute();
        for(Route stu1 : list2){
    %>
    
    <td><%=stu1.getRoute_Id()%></td>
    <td><%=stu1.getStart()%></td>
    <td><%=stu1.getStop()%></td>
    <td><%=stu1.getDriver_Id()%></td>
  </tr>
<%}%>
  </tbody>
</table>

<br>
  </div>

<center>  <button type="button" name="button" class="bb"><a href="Login.html">Logout</a></button>
  </body>
</html>

