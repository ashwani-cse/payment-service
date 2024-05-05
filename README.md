# Payment Gateway Service

Welcome to our payment gateway service! This service provides integration with multiple payment gateways including Stripe and Razorpay. Below you will find information on how to set up and use this service effectively.

## Table of Contents
- [Introduction](#introduction)
- [Getting Started](#getting-started)
    - [Prerequisites](#prerequisites)
    - [Installation](#installation)
- [Usage](#usage)
- [Webhook Configuration](#webhook-configuration)
- [Contributing](#contributing)
- [License](#license)

## Introduction

Our payment gateway service allows seamless integration of payment functionalities into your applications. With support for popular payment gateways like Stripe and Razorpay, you can easily manage payments, create payment links, and handle webhooks for various events.

## Getting Started

### Prerequisites

Before you begin, ensure you have the following installed:

- Java Development Kit (JDK) version 17 or higher
- Maven
- Node.js (for setting up localtunnel)

### Installation

To install and run the payment gateway service locally:

1. Clone this repository.
2. Ensure you have Maven installed.
3. Navigate to the project directory.
4. Run `mvn spring-boot:run` to start the service.

## Usage

Once the service is up and running, you can access it using the provided API endpoints. Here are some example endpoints:

- `GET /payments/test`: Check if the payment service is up and running.
- `POST /payments/`: Create a payment link.

Refer to the API documentation or codebase for more details on available endpoints and their usage.

## Webhook Configuration

To receive webhook events from Razorpay, follow these steps:

1. Install localtunnel using npm: `npm install -g localtunnel`.
2. Run localtunnel: `lt --port 8083`.
3. Configure the generated URL in the Razorpay dashboard under Webhook settings.
4. Add webhook URL (`https://<generated-url>/api/v1/payments/webhook`) and configure active events.
5. Save the configuration.

Now, your payment gateway service is ready to receive webhook events from Razorpay.

## Contributing

We welcome contributions from the community. Feel free to open issues for bug reports or feature requests. Pull requests are also appreciated.

## License

This project is licensed under the [MIT License](LICENSE).

## Stay Connected

Connect with us on social media and stay updated with the latest news and developments:

- [LinkedIn](https://www.linkedin.com/in/ashwanicse/)
- [Leetcode](https://leetcode.com/ashwani__kumar/)
- [Need Help? Schedule A Call](https://topmate.io/ashwanikumar)

## Subscribe to our Newsletter
Stay ahead of the curve by subscribing to our LinkedIn newsletter:
- [Subscribe Now](https://www.linkedin.com/newsletters/7084124970443767808/)

Experience the future of e-commerce with CommerceNexus - where innovation meets efficiency!
