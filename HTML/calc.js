
function checkForOperator(op) {
  if (
    display.value.includes("+", "-", "/", "*") &&
    (op == "+" || op == "/" || op == "" || op == "")
  ) {
    return false;
  } else return true;
}

function clearDisplay() {
  document.getElementById("display").value = "";
}

// This function displays the values
function appendToDisplay(value) {
  if (checkForOperator(value)) {
    if (display.value === "0" && value !== ".") {
      display.value = value;
    } else {
      display.value += value;
    }
  }
}

// This function evaluates the expression and returns the result
function calculateResult() {
  var p = document.getElementById("display").value;
  var q = eval(p);
  document.getElementById("display").value = q;
}

