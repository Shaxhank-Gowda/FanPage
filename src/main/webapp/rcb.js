console.log("from script file"); const addMemberBtn = document.getElementById('add-member-btn');
const removeMemberBtn = document.getElementById('remove-member-btn');
const updateDetailsBtn = document.getElementById('update-details-btn');
const fetchDetailsBtn = document.getElementById('fetch-details-btn');
const addMemberForm = document.getElementById('add-member-form');
const removeMemberForm = document.getElementById('remove-member-form');
const updateDetailsForm = document.getElementById('update-details-form');
const fetchDetailsSection = document.getElementById('fetch-details-section');

addMemberBtn.addEventListener('click', () => {
	addMemberForm.style.display = 'block';
	removeMemberForm.style.display = 'none';
	updateDetailsForm.style.display = 'none';
	fetchDetailsSection.style.display = 'none';
});

removeMemberBtn.addEventListener('click', () => {
	addMemberForm.style.display = 'none';
	removeMemberForm.style.display = 'block';
	updateDetailsForm.style.display = 'none';
	fetchDetailsSection.style.display = 'none';
});

updateDetailsBtn.addEventListener('click', () => {
	addMemberForm.style.display = 'none';
	removeMemberForm.style.display = 'none';
	updateDetailsForm.style.display = 'block';
	fetchDetailsSection.style.display = 'none';
});

fetchDetailsBtn.addEventListener('click', () => {
	addMemberForm.style.display = 'none';
	removeMemberForm.style.display = 'none';
	updateDetailsForm.style.display = 'none';
	fetchDetailsSection.style.display = 'block';
});

addMemberForm.addEventListener('submit', (e) => {
	e.preventDefault();

});

removeMemberForm.addEventListener('submit', (e) => {
	e.preventDefault();
	// remove member logic here
});

updateDetailsForm.addEventListener('submit', (e) => {
	e.preventDefault();
	// update details logic here
});

fetchDetailsBtn.addEventListener('click', () => {
	fetchDetailsSection.innerHTML = '<p>Loading...</p>';
	// fetch details logic here
});
