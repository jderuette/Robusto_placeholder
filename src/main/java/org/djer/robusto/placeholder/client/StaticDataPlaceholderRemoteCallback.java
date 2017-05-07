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
package org.djer.robusto.placeholder.client;

import org.djer.robusto.placeholder.client.dto.Placeholder;

import com.homeadvisor.robusto.CommandContext;
import com.homeadvisor.robusto.RemoteServiceCallback;

public class StaticDataPlaceholderRemoteCallback implements RemoteServiceCallback<Placeholder> {

	CommandContext ctx;

	@Override
	public void setContext(final CommandContext ctx) {
		this.ctx = ctx;
	}

	@Override
	public CommandContext getContext() {
		return this.ctx;
	}

	@Override
	public Placeholder run(final String url) {

		final Placeholder result = new Placeholder();

		result.setUserId(48);
		result.setId(12);
		result.setTitle("A static dataSet");
		result.setBody("A Static data body");

		return result;
	}

}
