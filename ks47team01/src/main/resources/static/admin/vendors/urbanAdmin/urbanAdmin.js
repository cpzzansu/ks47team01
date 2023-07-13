document.addEventListener('DOMContentLoaded', (event) => {
    let minefield = document.querySelector("#minefield");
    let mines = Array(100).fill(false).fill(true, 0, 20); // 20 mines in 100 cells
    mines.sort(() => Math.random() - 0.5); // shuffle the mines

    for(let i = 0; i < 100; i++) {
        let cell = document.createElement("div");
        cell.className = "cell";
        if(mines[i]) {
            cell.addEventListener("click", function() {
                alert("Boom! Game Over.");
                location.reload();
            });
        } else {
            cell.addEventListener("click", function() {
                cell.style.backgroundColor = "green";
                cell.innerHTML = "SAFE";
            });
        }
        minefield.appendChild(cell);
    }
});
