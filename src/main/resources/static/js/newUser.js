document.getElementById('userForm').addEventListener('submit', function(event) {
    event.preventDefault(); // Prevenir el envío por defecto del formulario

    // Crear un objeto FormData para recopilar los datos del formulario
    const formData = new FormData(this);
    const userData = {};

    // Convertir FormData a un objeto JSON
    formData.forEach((value, key) => {
        userData[key] = value;
        
    });
    

    // Enviar los datos en formato JSON
    fetch('http://localhost:8080/jspsring/add-user', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json',
        },
        body: JSON.stringify(userData),
    })
    .then(response => {
        console.log(response.json);
        if (!response.ok) {
            throw new Error('Network response was not ok');
        }
        return response.json();
    })
    .then(data => {
        console.log('Success:', data);
        // Aquí puedes manejar la respuesta del servidor
    })
    .catch(error => {
        console.error('Error:', error);
    });
});
