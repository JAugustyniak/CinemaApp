<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Cinema</title>
    <link rel="stylesheet" href="<c:url value="/resources/vendor/bootstrap/css/bootstrap.min.css" />">
    <link rel="stylesheet" href="<c:url value="/resources/vendor/movie-review-theme/fonts/font-awesome.min.css" /> ">
    <link rel="stylesheet" href="<c:url value="/resources/vendor/movie-review-theme/style.css" /> ">
    <link rel="stylesheet" href="<c:url value="/resources/css/style.css" /> ">
    <link rel="stylesheet" href="<c:url value="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css"/> ">
</head>
<body>
<div id="site-content">
    <header class="site-header">
        <div class="container">
            <a href="/" id="branding">
                <img src="/resources/images/logo.png" alt="" class="logo">
                <div class="logo-copy">
                    <h1 class="site-title">AsiaCinema</h1>
                    <small class="site-description">The best cinema in the world</small>
                </div>
            </a>
            <div class="main-navigation">
                <button type="button" class="menu-toggle"><i class="fa fa-bars"></i></button>
                <ul class="menu">
                    <li class="menu-item current-menu-item"><a href="/">Home</a></li>
                    <sec:authorize access="isAnonymous()">
                        <li class="menu-item"><a href="/seance">Seance</a></li>
                    </sec:authorize>
                    <sec:authorize access="isAuthenticated()">
                        <div class="dropdown">
                            <button class="dropbtn">Seance</button>
                            <div class="dropdown-content">
                                <li class="menu-item-drop"><a href="/seance/add">Add</a></li>
                                <li class="menu-item-drop"><a href="/seance">List</a></li>
                            </div>
                        </div>
                    </sec:authorize>
                    <sec:authorize access="isAnonymous()">
                        <li class="menu-item"><a href="/login">Login</a></li>
                    </sec:authorize>
                    <sec:authorize access="isAuthenticated()">
                        <div class="dropdown">
                            <button class="dropbtn">Movie</button>
                            <div class="dropdown-content">
                                <li class="menu-item-drop"><a href="/movie/add">Add</a></li>
                                <li class="menu-item-drop"><a href="/movie">List</a></li>
                            </div>
                        </div>
                        <div class="dropdown">
                            <button class="dropbtn">Cinema hall</button>
                            <div class="dropdown-content">
                                <li class="menu-item-drop"><a href="/hall/add">Add</a></li>
                                <li class="menu-item-drop"><a href="/hall">List</a></li>
                            </div>
                        </div>
                        <li class="menu-item current-menu-item"><a href="/reservation/list">Reservations</a></li>
                        <li class="menu-item"><a href="/logout">Logout</a></li>
                    </sec:authorize>

                </ul>
            </div>
            <div class="mobile-navigation"></div>
        </div>
    </header>
    <main class="main-content">