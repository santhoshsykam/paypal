API to calculate Amortization Schedule  Loan.

Project Info: The program prompts the user for the amount he or she is borrowing, the annual percentage rate used to repay the loan, the term, in years, over which the loan is repaid.

The response includes: - payment number - Amount of the payment. - Amount paid to interest. - Current balance - Total payment amount - Interest paid fields.


Project Setup: Download this project. Compile the java files or set up in Eclipse workspace.
requires Maven,Spring tool suite to run spring boot application, Java 1.8.

For standalone application run AmortizationClient.java.

For Rest web service run PaypalApplication as  Spring boot app.
once the server is started, please hit the below url in postman client or any rest client
POST:localhost:{Your server port}/paypal/v1/amortizationScheduler

sample request: 
headers:{Content-Type:application/json}
body:
{
"principal":1000,
"annualInterestRate":10,
"loanTerm":1
}

sample response:

{
    "paymentNumber": [
        0,
        1,
        2,
        3,
        4,
        5,
        6,
        7,
        8,
        9,
        10,
        11,
        12
    ],
    "monthlyPaymentAmount": [
        0,
        87.92,
        87.92,
        87.92,
        87.92,
        87.92,
        87.92,
        87.92,
        87.92,
        87.92,
        87.92,
        87.92,
        87.87
    ],
    "currentMonthlyInterest": [
        0,
        8.33,
        7.67,
        7,
        6.33,
        5.65,
        4.96,
        4.27,
        3.57,
        2.87,
        2.16,
        1.45,
        0.73
    ],
    "currentBalance": [
        1000,
        920.41,
        840.16,
        759.24,
        677.65,
        595.38,
        512.42,
        428.77,
        344.42,
        259.37,
        173.61,
        87.14,
        0
    ],
    "totalAmountPaid": [
        0,
        87.92,
        175.84,
        263.76,
        351.68,
        439.6,
        527.52,
        615.44,
        703.36,
        791.28,
        879.2,
        967.12,
        1054.99
    ],
    "totalInterestPaid": [
        0,
        8.33,
        16,
        23,
        29.33,
        34.98,
        39.94,
        44.21,
        47.78,
        50.65,
        52.81,
        54.26,
        54.99
    ]
}