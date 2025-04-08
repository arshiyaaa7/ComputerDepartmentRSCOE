document.addEventListener('DOMContentLoaded', () => {
    const departmentInfo = document.getElementById('department-info');
    
    fetch('data.xml')
        .then(response => response.text())
        .then(data => {
            const parser = new DOMParser();
            const xml = parser.parseFromString(data, 'text/xml');
            const departments = xml.getElementsByTagName('department');

            let content = '<ul>';
            for (let dept of departments) {
                content += `<li><strong>${dept.getElementsByTagName('name')[0].textContent}</strong>: ${dept.getElementsByTagName('description')[0].textContent}</li>`;
            }
            content += '</ul>';

            departmentInfo.innerHTML = content;
        })
        .catch(error => console.error('Error loading XML:', error));
});
