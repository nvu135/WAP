const Module = (function () {
    var accountName;
    var balance = 0;

    const createAccount = function (accountName, balance) {
        accountName = accountName;
        balance = balance;
        return {
            accountName,
            balance
        }
    };
    const getName = function () {
        return accountName;
    };
    const getBalance = function () {
        return balance;
    };
    return {
        createAccount,
        getName,
        getBalance
    };
})();

var accountInfoList = [];

function onLoad() {
    var button = document.getElementById("button");
    button.onclick = onclickHandler;
}

function onclickHandler() {

    const name = document.getElementById("accountname").value;
    const deposit = document.getElementById("deposit").value;
    const account = Module.createAccount(name, deposit);
    accountInfoList.push(account);
    console.log(account);
    document.getElementById("display").value = '';
    for(const account of accountInfoList){
            document.getElementById("display").value += "Account Name: " + `${account.accountName}` + ", Balance: " + `${account.balance}; ` + "\n";
    }
}
//window.addEventListener('load', function () {
//    onLoad();
//})
window.onload = onLoad;
