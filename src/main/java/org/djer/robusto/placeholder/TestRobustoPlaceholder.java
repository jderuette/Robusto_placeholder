/**
MIT License

Copyright (c) 2017 Djer13

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
**/
package org.djer.robusto.placeholder;

import org.djer.robusto.placeholder.client.StaticDataPlaceholderRemoteCallback;
import org.djer.robusto.placeholder.client.dto.Placeholder;
import org.djer.robusto.placeholder.client.spring.PlaceholderClient;

import com.homeadvisor.robusto.ApiCommand;
import com.homeadvisor.robusto.ConstantUriProvider;
import com.netflix.hystrix.HystrixCommandProperties;

/**
 * @author djer
 *
 */
public class TestRobustoPlaceholder {

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(final String[] args) {
		System.out.println("Get Placeholder sample data using POJO");
		System.out.println(getStaticData());

		System.out.println("Get Placeholder sample data using Spring Rest Client");
		System.out.println(getDataUsingSpringRest());
	}

	/**
	 * Get data from a Basic remoteCallBack (return static data)
	 *
	 * @return
	 */
	private static Object getStaticData() {
		@SuppressWarnings("PMD.LawOfDemeter")
		final ApiCommand<Placeholder> command = ApiCommand.<Placeholder>builder()
				.withUriProvider(new ConstantUriProvider<Placeholder>("https://jsonplaceholder.typicode.com"))
				.withRemoteServiceCallback(new StaticDataPlaceholderRemoteCallback()).withNumberOfRetries(5)
				.withHystrixCommandProperties(
						HystrixCommandProperties.Setter().withExecutionTimeoutInMilliseconds(10000))
				.build();

		final Object result = command.execute();

		return result;
	}

	/**
	 * Use spring rest client template to 1) call apiService, 2) map data to the
	 * placeHolder DTO
	 *
	 * @return Data from the server side API
	 */
	private static Placeholder getDataUsingSpringRest() {
		final PlaceholderClient service = new PlaceholderClient();
		return service.getPlaceHolderData("posts", "2");
	}

}
