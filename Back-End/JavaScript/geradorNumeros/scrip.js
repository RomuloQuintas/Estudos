document.addEventListener('DOMContentLoaded', function () {
            let button = document.getElementById('generate');
            const result = 695;

            function gerarNum() {
                document.getElementById('resultado').textContent = result;
            }

            button.addEventListener('click', gerarNum);
        });