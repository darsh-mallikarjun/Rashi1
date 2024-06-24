const inputEl = document.querySelector("#autocomplete-input");


inputEl.addEventListener("input" , onInputChange);

getCountry();
const countryInput = document.getElementById('country-input');
const countryList = document.getElementById('country-list');


let countryNames =[];
// Function to fetch countries based on input
async function getCountry() {
    const countryresp = await fetch('http://localhost:8080/search/autocomplete');
    const data = await countryresp.json();
    countryNames = data.map( (country) =>{
    return country;
    });
  } 

  function onInputChange(){
    removeAutoCoumpleteDropDown();

 const value = inputEl.value.toLowerCase();

 if(value.length === 0) return;

const filteredNames =[];

 countryNames.forEach((countryName) =>{
if(countryName.substr(0,value.length).toLowerCase() ===value)
  filteredNames.push(countryName);
 });
createAutoCoumpleteDropDown(filteredNames);
  }

  function createAutoCoumpleteDropDown(list){
    const listEl =document.createElement("ul");
    listEl.className = "autocomplete-list";
    listEl.id = "autocomplete-list";

    list.forEach((country) => {
      const listItem = document.createElement("li");
      const countryButton = document.createElement("button");
      countryButton.innerHTML = country;
      countryButton.addEventListener("click" , onCountryButtonClick);
      listItem.appendChild(countryButton);

      listEl.appendChild(listItem);
    });

    document.querySelector("#autocomplete-wrapper").appendChild(listEl);
  }

  function removeAutoCoumpleteDropDown(){

    const listEl = document.querySelector("#autocomplete-list");
    if(listEl) listEl.remove();

  }

  function onCountryButtonClick(e){
    e.preventDefault();
    
const buttonEl = e.target;
  inputEl.value = buttonEl.innerHTML;

  removeAutoCoumpleteDropDown();
  }