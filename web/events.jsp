
<%@page import="musicentities.EventEntity"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html xmlns="http://www.w3.org/1999/xhtml">
    <head>
        <title>Live Concert Hall Booking </title>
        <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
        <link rel="stylesheet" href="css/layout.css" type="text/css" />
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
                            <legend>Event Search</legend>
                            <input type="text" value="Search Events&hellip;"/>
                            <input type="image" id="go" src="images/search.gif" alt="Search" />
                        </fieldset>
                    </form>

                    <ul id="topnav" class="clear">
                        <li><a href="help.html">HELP</a></li>
                        <li><a href="contactus.html">CONTACT US</a></li>
                        <li><a href="map.html">MAP</a></li>
                        <li><a href="booktickets.html">BOOK TICKETS</a></li>
                        <li class="active"><a href="events.html">EVENTS</a></li>
                        <li><a href="aboutus.html">ABOUT US</a></li>
                        <li class="last"><a href="index.html">HOME</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="wrapper col3">
            <div id="container" class="clear"> 
                <!-- ####################################################################################################### -->
                <div id="portfolio">
                    <ul>
                        <c:forEach var="event" items="${events}" varStatus="loop">


                            <table>
                                <tr>
                                    <td>
                                        <li class="clear">
                                            <div class="f1_left">
                                                <h1>${event.eventName} </h1>

                                                <p>${event.eventDesc} </p>
                                                <p>${event.eventDate} ${event.eventTime}</p>

                                            </div>
                                        </li>
                                    </td>
                                </tr>
                            </table>
                        </c:forEach>
                    </ul>
                    <!--                          <ul>
                                                <li class="clear">
                                                  <div class="f1_left">
                                                    <h1>Jazz & Blues</h1>
                                                    <p> The jazz & blues genre has created a sound that grabs the attention of all who hear it. While the genre has traditionally focused on intimate settings, front-runners of the genre today like Michael Buble and John Mayer have been able to bring a following back to the jazz & blues genre selling out arenas across the globe.</p>
                                                    <p>April 28,2015  12:15PM   4:00PM   7:10PM</p>
                                                  </div>
                                                </li>
                                                <li class="clear">
                                                  <div class="fl_left">
                                                    <h1>Rock & Pop</h1>
                                                    <p>The diversity found in the audience at a rock & pop concert has become just as standard as the production. Combine emerging artists like Sam Smith and established acts like Jimmy Buffet all in the same mix and you get a playlist that has something for every fan with one of the largest followings of all the genres in the music industry.</p>
                                                    <p>April 29,2015    1:00PM  4:00PM  8:00PM</p>
                                                  </div>
                                                </li>
                                                <li class="clear last">
                                                  <div class="f1_left">
                                                    <h1>Country & Folk</h1>
                                                    <p>The country & folk genre has long been one of the music industry?s most popular, creating some of the largest names in show-biz to date. the country music stars of today such as George Strait and Alan Jackson have kept a more than stable following around.</p>
                                                    <p>April 30,2015    10:00AM 1:15PM  2:30PM</p>
                                                  </div>
                                                </li>
                                              </ul>-->
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
                                        <input type="text" id="newsletter" value="Enter Email Here&hellip;" />
                                        <input type="image" id="subscribe" src="images/submit.gif" alt="Submit" />
                                    </fieldset>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>

                </body>
                </html>