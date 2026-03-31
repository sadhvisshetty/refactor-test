function getData() {
    fetch("http://127.0.0.1:5000/")
        .then(response => response.json())
        .then(data => {
            document.getElementById("output").innerText = data.message;
        })
        .catch(error => console.error(error));
}