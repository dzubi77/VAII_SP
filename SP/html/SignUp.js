function submitSignUpForm() {
    const username = document.getElementById('username').value;
    const email = document.getElementById('email').value;
    const password = document.getElementById('password').value;
    const confirmPassword = document.getElementById('passwordConfirm').value;


    if (username === '' || email === '' || password === '' || confirmPassword === '') {
        alert('Please fill all fields!');
    } else {
        if (!validateEmail(email)) {
            document.getElementById('emailError').innerText = 'Please enter a valid email address.';
            return;
        } else {
            document.getElementById('emailError').innerText = '';
        }

        const passwordError = validatePassword(password);
        if (passwordError) {
            document.getElementById('weakPassword').innerText = passwordError;
            return;
        } else {
            document.getElementById('weakPassword').innerText = '';
        }

        if (password !== confirmPassword) {
            document.getElementById('passwordMatchError').innerText = 'Passwords do not match.';
            return;
        } else {
            document.getElementById('passwordMatchError').innerText = '';
        }


        const user = {
            username: username,
            email: email,
            password: password
        };

        fetch('http://localhost:8080/users/signup', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json',
            },
            body: JSON.stringify(user),
        })
            .then(response => response.json())
            .then(data => {
                console.log('Success:', data);
            })
            .catch((error) => {
                console.error('Error:', error);
            });
    }
    function validateEmail(email) {
        const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        return emailRegex.test(email);
    }

    function validatePassword(password) {
        if (password.length < 8) {
            return 'Password must be at least 8 characters long.';
        }
        const hasNumber = /\d/.test(password);
        if (!hasNumber) {
            return 'Password must contain at least one number.';
        }
        return '';
    }
}