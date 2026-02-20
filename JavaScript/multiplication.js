function generateMultiplicationTable(rows = 10, cols = 10) {
    let tableHTML = '<table border="1" cellpadding="5" cellspacing="0">';
    
    tableHTML += '<tr><th>&times;</th>';
    for (let j = 1; j <= cols; j++) {
        tableHTML += `<th>${j}</th>`;
    }
    tableHTML += '</tr>';
    
    for (let i = 1; i <= rows; i++) {
        tableHTML += `<tr><th>${i}</th>`;
        for (let j = 1; j <= cols; j++) {
            tableHTML += `<td>${i * j}</td>`;
        }
        tableHTML += '</tr>';
    }
    
    tableHTML += '</table>';
    return tableHTML;
}

function displayMultiplicationTable(containerId, rows = 10, cols = 10) {
    const container = document.getElementById(containerId);
    if (container) {
        container.innerHTML = generateMultiplicationTable(rows, cols);
    } else {
        console.error('Container not found: ' + containerId);
    }
}

document.addEventListener('DOMContentLoaded', function() {
    displayMultiplicationTable('tableContainer', 10, 10);
});
