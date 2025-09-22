const display = document.getElementById('result');
let isResultDisplayed = false;

function appendToDisplay(input) {
    const operators = ['+', '-', '*', '/'];
    
    if (isResultDisplayed) {
        const numericValue = display.value.split(' ')[0];
        if (!operators.includes(input)) {
            display.value = input;
        } else {
            display.value = numericValue + input;
        }
        isResultDisplayed = false;
        return;
    }

    const lastChar = display.value.slice(-1);
    if (operators.includes(lastChar) && operators.includes(input)) {
        display.value = display.value.slice(0, -1) + input;
    } else {
        display.value += input;
    }
}

function clearDisplay() {
    display.value = '';
    isResultDisplayed = false;
}

function deleteLast() {
    display.value = display.value.slice(0, -1);
}

function calculateResult() {
    if (!display.value) {
        return;
    }

    try {
        const expression = display.value;
        let result = eval(expression);
        let finalResult = parseFloat(result.toFixed(10));
     let emoji = '🔮';

        if (expression.includes('+')) emoji = '🪄';
        if (expression.includes('-')) emoji = '💨';
        if (expression.includes('*')) emoji = '👯';
        if (expression.includes('/')) emoji = '🧩';
        
        display.value = `${finalResult} ${emoji}`;
        isResultDisplayed = true;
    } catch (error) {
        display.value = 'Error 😵';
        isResultDisplayed = true;
    }
}