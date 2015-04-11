<%-- 
    Document   : successregistration
    Created on : Apr 11, 2015, 2:42:46 PM
    Author     : S522574
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body id="top">
<div class="wrapper col1">
  <div id="header" class="clear">
    <div class="fl_left">
      <h1><a href="index.html">Live Music Concert Hall Booking</a></h1>
      <p>Get Ready for the fun!!</p>
    </div>
        <div class="fl_right">
      <form action="#" method="post" id="search">
        <fieldset>
          <legend>Site Search</legend>
          <input type="text" value="Search Our Website&hellip;" />
          <input type="image" id="go" src="images/search.gif" alt="Search" />
        </fieldset>
      </form>
      <ul id="topnav" class="clear">
          <li><a href="help.html">HELP</a></li>
        <li><a href="contactus.html">CONTACT US</a></li>
        <li class="active"><a href="map.html">MAP</a></li>
        <li><a href="aboutus.html">ABOUT US</a></li>
        <li class="last"><a href="index.html">HOME</a></li>
      </ul>
    </div>
  </div>
</div>
<!--<div class="wrapper col2">
  <div id="shout">
    <h2>Two Column Template</h2>
  </div>
</div>-->

<div class="wrapper col3">
    <center>  <div id="container" class="clear"> 
   
    <div id="content">
        Email Id:${email}Registered Successfully.Click on OK to go login page.
    </div>
  
  </div>
    </center>
</div>

<div class="wrapper">
  <div id="footer">
    <div class="verticaline clear">
      <div class="box size1">
        <h2>Keep in Touch</h2>
        <p id="rss"><a href="#"><img src="images/rss.gif" alt="" /></a></p>
      </div>
      <div class="box size2">
        <address>
        <strong class="title">Company Name</strong><br />
        NWMSU Live Concert Hall Booking<br />
        Maryville<br />
        64468
        </address>
        <ul>
          <li><strong class="title">Tel:</strong><br />
            660.562.1145</li>
          <li><strong class="title">Fax:</strong><br />
           660.562.1146</li>
          <li><strong class="title">Email:</strong><br />
            <a href="#">livemusic@nwmsu.edu.in</a></li>
        </ul>
      </div>
      <div class="box size3">
        <ul>
          <li><span>Facebook:</span> <a href="#">www.facebook.com/NwmsuLiveMusic</a></li>
          <li><span>Twitter:</span> <a href="#">www.twitter.com/NwmsuLiveMusic</a></li>
          <li><span>LinkedIn:</span> <a href="#">www.linkedin.com/NwmsuLiveMusic</a></li>
        </ul>
        <form action="#" method="post">
          <fieldset>
            <legend>Newsletter Signup:</legend>
            <input type="text" id="newsletter" value="Enter Email Here&hellip;" onfocus="this.value=(this.value=='Enter Email Here&hellip;')? '' : this.value ;" />
            <input type="image" id="subscribe" src="images/submit.gif" alt="Submit" />
          </fieldset>
        </form>
      </div>
    </div>
  </div>
</div>

</body>
</html>