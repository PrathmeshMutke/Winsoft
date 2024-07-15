document.addEventListener('DOMContentLoaded', () => {
    const locationElement = document.getElementById('location');
    const temperatureElement = document.getElementById('temperature');
    const descriptionElement = document.getElementById('description');

    const fetchWeather = async () => {
        try {
            const response = await fetch('/api/weather');
            const data = await response.json();

            locationElement.textContent = `Location: ${data.name}, ${data.sys.country}`;
            temperatureElement.textContent = `Temperature: ${data.main.temp} °C`;
            descriptionElement.textContent = `Weather: ${data.weather[0].description}`;
        } catch (error) {
            console.error('Error fetching weather data:', error);
            locationElement.textContent = 'Error fetching weather data.';
        }
    };

    fetchWeather();
});
