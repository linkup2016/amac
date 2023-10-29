document.addEventListener("DOMContentLoaded", function () {
    const registrationForm = document.getElementById("registration-form");

    registrationForm.addEventListener("submit", function (event) {
        event.preventDefault(); // Prevent the default form submission

        const formData = new FormData(registrationForm);
        const registrationData = {};

        formData.forEach(function (value, key) {
            registrationData[key] = value;
        });

        // Convert form data to JSON
        const jsonData = JSON.stringify(registrationData);

        // Send the data to your API as JSON
        fetch('http://localhost:8080/membership/new-member', {
            method: 'POST',
            body: jsonData,
            headers: {
                'Content-Type': 'application/json'
            }
        })
            .then(response => response.json())
            .then(data => {
                // Handle the API response here (e.g., show a success message)
                console.log(data);
            })
            .catch(error => {
                // Handle any errors that occur during the API request
                console.error(error);
            });

        // Save form data after submission (optional)
        saveFormData(jsonData);
    });

    // Function to save form data to local storage (optional)
    function saveFormData(data) {
        localStorage.setItem('formData', data);
    }

    // Function to restore form data from local storage (optional)
    function restoreFormData() {
        const savedData = localStorage.getItem('formData');
        if (savedData) {
            const parsedData = JSON.parse(savedData);
            const inputFields = registrationForm.querySelectorAll('input');
            inputFields.forEach(function (inputField) {
                const fieldName = inputField.name;
                if (parsedData[fieldName]) {
                    inputField.value = parsedData[fieldName];
                }
            });
        }
    }

    // Restore form data when the page loads (optional)
    restoreFormData();
});

