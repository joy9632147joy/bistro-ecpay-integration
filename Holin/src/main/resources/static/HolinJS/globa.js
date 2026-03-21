/* ============================================================
   HoLin53 — global.js
   所有頁面共用的 JS 功能
   ============================================================ */

// ── 導覽列滾動效果 ─────────────────────────────────────────
window.addEventListener('scroll', function () {
    let navbar = document.querySelector('.navbar');
    if (!navbar) return;
    if (window.scrollY > 200) {
        navbar.classList.add('scrolled');
    } else {
        navbar.classList.remove('scrolled');
    }
});

// ── 回到頂部 ───────────────────────────────────────────────
function topFunction() {
    window.scrollTo({ top: 0, behavior: 'smooth' });
}

function checkScroll() {
    let myBtn = document.getElementById('myBtn');
    if (!myBtn) return;
    if (document.documentElement.scrollTop > 600) {
        myBtn.classList.add('visible');
    } else {
        myBtn.classList.remove('visible');
    }
}