/*
Yaaic - Yet Another Android IRC Client

Copyright 2009-2010 Sebastian Kaspari

This file is part of Yaaic.

Yaaic is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

Yaaic is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with Yaaic.  If not, see <http://www.gnu.org/licenses/>.
*/
package org.yaaic.test.receiver;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * All tests in org.yaaic.test.receiver
 * 
 * @author Sebastian Kaspari <sebastian@yaaic.org>
 */
public class AllTests
{
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.yaaic.test.receiver");
		//$JUnit-BEGIN$
		suite.addTestSuite(ConversationReceiverTest.class);
		//$JUnit-END$
		return suite;
	}

}