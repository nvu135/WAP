<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@ include file="../common/header.jspf" %>
<%@ include file="../common/navigation.jspf" %>
<link rel="stylesheet" href="resources/overview.css">

<div id="checkout">
    <div class="container">
        <form action="/checkout.do" method="post">
            <h1>Information Order</h1>
            <c:if test="${not empty error}">
                <p style="color: red; font-weight: bold">${errors}</p>
            </c:if>
            <div class="form-group">
                <label for="street">Street:</label> <input type="text"
                                                           class="form-control" id="street" placeholder="Enter street.."
                                                           name="street">
            </div>

            <div class="form-group">
                <label for="city">City:</label> <input type="text"
                                                       class="form-control" id="city" placeholder="Enter city.."
                                                       name="city">
            </div>

            <div class="form-group">
                <label for="zipCode">ZipCode:</label> <input type="text"
                                                             class="form-control" id="zipCode"
                                                             placeholder="Enter zipCode.."
                                                             name="zipCode">
            </div>

            <div class="form-group">
                <label for="state">State:</label> <input type="text"
                                                         class="form-control" id="state" placeholder="Enter state.."
                                                         name="state">
            </div>

            <div class="form-group">
                <label for="phone">Phone Number:</label> <input type="text"
                                                                class="form-control" id="phone"
                                                                placeholder="Enter phone number.."
                                                                name="phone">
            </div>

            <div class="form-group">
                <label for="email">Email:</label> <input type="email"
                                                         class="form-control" id="email" placeholder="Enter email.."
                                                         name="email">
            </div>

            <div class="form-group">
                <label for="cartNumber">CartNumber:</label> <input type="text"
                                                                   class="form-control" id="cartNumber"
                                                                   placeholder="Cart Number.."
                                                                   name="cartNumber">
            </div>

            <input type="submit" class="btn btn-danger" value="Finish" id=""/>
        </form>
    </div>
</div>

<%@ include file="../common/footer.jspf" %>