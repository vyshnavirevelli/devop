<?php
echo "Your name: " . $_POST["n"] . "<br>";
echo "Your password: " . $_POST["pass"] . "<br>";
echo "Your email: " . $_POST["email"] . "<br>";
echo "Languages you know: <br>";
foreach($_POST["language"] as $lang) {
    echo $lang . "<br>";
}
?>